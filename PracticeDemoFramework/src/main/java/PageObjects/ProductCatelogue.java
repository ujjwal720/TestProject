package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.WrapsElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import AbstractComponents.AbstractComponents;

public class ProductCatelogue extends AbstractComponents {

	WebDriver driver;
	int x = 0;

	public ProductCatelogue(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='card']/div/h5")
	List<WebElement> Products;

	By Product = By.xpath("//div[@class='card']/div/h5");

	@FindBy(xpath = "//button[@class='btn w-10 rounded']")
	WebElement addcart;

	By CartButton = By.xpath("(//button[@class='btn btn-custom'])[3]");

	@FindBy(xpath = "//div[@class='cartSection']/h3")
	List<WebElement> CartList;

	@FindBy(xpath = "(//button[@class='btn btn-custom'])[3]")
	WebElement cart1;

	By checkout = By.xpath("//button[normalize-space()='Checkout']");

	@FindBy(xpath = "//button[normalize-space()='Checkout']")
	WebElement checkout2;

	public List<WebElement> getProductList() {
		waitElement(Product);

		return Products;
	}

	public void getByName(String s) {

		for (int i = 0; i <= Products.size() - 1; i++) {
			String target = Products.get(i).getText();
			if (target.contains(s)) {
				addcart.click();
			}
		}

	}

	/// wait untill elemnt is not visible
	public void addtocart() throws InterruptedException {

		waitElement(CartButton);

	}

	/// wait untill element is not clickable
	public void cartclick() {
		waitElement2(CartButton);
		x = 2;

	}

	public void cartclick2() {
		if (x == 2) {
          cart1.click();
		}
	}

	public void cartListVerify(String s) {
		for (int j = 0; j <= CartList.size() - 1; j++) {
			String target = CartList.get(j).toString();
			System.out.println(target);
			if (target.contains(s)) {
				boolean n = true;
				Assert.assertTrue(n);
				System.out.println("It is working");
			}
		}
	}

	public void checkout() {
		waitElement(checkout);
	}

	public void checkoutClick() {
		waitElement2(checkout);
		checkout2.click();
	}

}
