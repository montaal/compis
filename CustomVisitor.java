
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class CustomVisitor extends DatalogBaseVisitor<String> {
    Map<String, ArrayList<String>> tables = new HashMap<String, ArrayList<String>>();
    DatabaseConnection db = DatabaseConnection.getDatabaseConnection();

    @Override public String visitProg(DatalogParser.ProgContext ctx) {
        System.out.println();
        System.out.println("Executing...");
        String query = "SELECT * FROM tables";
        ArrayList<String> tabs = db.executeQuery(query, 2);
        for(String s : tabs){
            String table[] = s.split(",");
            ArrayList<String> cols = new ArrayList<>();
            for(int i=1; i<table.length;i++){
                cols.add(table[i]);
            }
            tables.put(table[0],cols);
        }
        return visitChildren(ctx);
    }


	@Override public String visitDeletedec(DatalogParser.DeletedecContext ctx) {
        return visitChildren(ctx);
    }

    @Override public String visitTableParam(DatalogParser.TableParamContext ctx) {
        return ctx.getText();
    }

    @Override public String visitQuery(DatalogParser.QueryContext ctx) {
        String id = ctx.ID().getText();
        String result="";
        System.out.print("For query: "+ctx.getText().replace("?","")+" => ");
        if(tables.containsKey(id)){
            ArrayList<String> columns = tables.get(id);
            String params =visit(ctx.predParam());
            ArrayList<String> values = new ArrayList(Arrays.asList(params.split(",")));
            if(columns.size()==values.size()){
                ArrayList<Integer> cnst = new ArrayList<>();
                for(int i =0; i<values.size();i++){
                    String s = values.get(i);
                    if(s.charAt(0)>='A'&&s.charAt(0)<='Z'){
                    }else{
                        cnst.add(i);
                    }
                }
                String sql = "SELECT "+String.join(",", columns)+" FROM "+id;
                if(cnst.size()>0){
                    sql+=" WHERE ";
                }
                for(int i=0; i<cnst.size();i++){
                    int c = cnst.get(i);
                    sql+= columns.get(c)+" = '"+values.get(c)+"'";
                    if(i<cnst.size()-1){
                        sql+=" AND ";
                    }
                }
                sql+="";
                ArrayList<String> results = db.executeQuery(sql, columns.size());
                System.out.println();
                for(String s: results){
                    System.out.println(id+"("+s+")");
                }
                result = "\n";

            }else{
                result="ERROR: parameter_arity_missmatch_expected_"+columns.size()+"_recieved_"+values.size()+"\n";
            }
        }else{
            result="ERROR: non_existing_table_"+id+"\n";
        }
        return result;
    }
    @Override public String visitPredParam(DatalogParser.PredParamContext ctx) {
        return ctx.getText();
    }
	@Override public String visitFactParam(DatalogParser.FactParamContext ctx) {
        return ctx.getText();
    }
	@Override public String visitIdList(DatalogParser.IdListContext ctx) {
        return visitChildren(ctx);
    }
	@Override public String visitStringIdList(DatalogParser.StringIdListContext ctx) {
        return visitChildren(ctx);
    }
	@Override public String visitVarList(DatalogParser.VarListContext ctx) {
        return visitChildren(ctx);
    }

	@Override public String visitAction(DatalogParser.ActionContext ctx) {
        return visitChildren(ctx);
    }

	@Override public String visitHeadPredicate(DatalogParser.HeadPredicateContext ctx) {
        return visitChildren(ctx);
    }

	@Override public String visitPredicate(DatalogParser.PredicateContext ctx) {
        return visitChildren(ctx);
    }

	@Override public String visitPredicateList(DatalogParser.PredicateListContext ctx) {
        return visitChildren(ctx);
    }

	@Override public String visitParameter(DatalogParser.ParameterContext ctx) {
        return visitChildren(ctx);
    }

	@Override public String visitParameterList(DatalogParser.ParameterListContext ctx) {
        return visitChildren(ctx);
    }

	@Override public String visitExpression(DatalogParser.ExpressionContext ctx) {
        return visitChildren(ctx);
    }

	@Override public String visitOperator(DatalogParser.OperatorContext ctx) {
        return visitChildren(ctx);
    }



}
