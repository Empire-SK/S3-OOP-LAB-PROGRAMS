class GarbageColl {
    
    public void finalize(){
        System.err.println("Obect Memory Realised");
    }
    
    public static void main(String[] args) {
        GarbageColl s=new GarbageColl();
        s=null;
        System.gc();
    }
}
