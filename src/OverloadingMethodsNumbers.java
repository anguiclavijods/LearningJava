class OverloadingMethodsNumbers {

    private String formatNumber(int value){
        return String.format("%d", value);
    }

    private String formatNumber(double value){
        return String.format("%.3f", value);
    }

    private String formatNumber(String value){
        return String.format("%.2f", Double.parseDouble(value));
    }

    public static void main(String[] args){
        //create object
        OverloadingMethodsNumbers om = new OverloadingMethodsNumbers();
        //print and asign values
        System.out.println(om.formatNumber(500));
        System.out.println(om.formatNumber(89.9934));
        System.out.println(om.formatNumber("440"));
    }
}
