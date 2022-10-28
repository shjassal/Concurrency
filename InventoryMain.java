public class InventoryMain {
    public static void main(String[] args) {
        int numOfAdd;
        int numOfRemove;
        int bugFlag;
        if (args.length > 0) {
            try {
                //converting arguments to integers
                numOfAdd = Integer.parseInt(args[0]); 
                numOfRemove = Integer.parseInt(args[1]); 
                bugFlag = Integer.parseInt(args[2]); 

                InventoryTracking IT = new InventoryTracking();
                Warehouse w = new Warehouse(IT);
                w.doAllAdds(numOfAdd); // completing all add operations
                w.doAllRemoves(numOfRemove);// completing all remove operations
                
            } catch (NumberFormatException e) {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }
    }
}