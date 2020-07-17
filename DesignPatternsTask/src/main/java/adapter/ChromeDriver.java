package adapter;

public class ChromeDriver implements WebDriver{
    @Override
    public void getElement() {
        System.out.println("Get Element from ChromeDriver");
    }

    @Override
    public void selectElement() {
        System.out.println("Select Element from ChromeDriver");
    }
}
