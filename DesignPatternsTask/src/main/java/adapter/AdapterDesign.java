package adapter;

public class AdapterDesign {
    public static void main(String []args){
        ChromeDriver a=new ChromeDriver();
        a.getElement();
        a.selectElement();
        IEDriver e=new IEDriver();
        e.findElement();
        e.clickElement();
        WebDriver w=new WebDriverAdapter(e);
        w.getElement();
        w.selectElement();
    }
}
