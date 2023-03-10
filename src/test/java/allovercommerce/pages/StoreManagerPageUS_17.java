package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoreManagerPageUS_17 {
    public StoreManagerPageUS_17() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(linkText = "Store Manager")
    public WebElement storeManager;

    @FindBy(linkText = "Products")
    public WebElement productsButton;

    @FindBy(xpath = "//option[text()='Variable Product']")
    public WebElement variableProductOption;

    @FindBy(id = "product_type")
    public WebElement productTypeDropdown;

    @FindBy(linkText = "Add New")
    public WebElement addNewButton1;

    // @FindBy(id = "dropdown_product_type")
    // public WebElement allProductTypes;

    @FindBy(id = "pro_title")
    public WebElement productTitleInput;

    @FindBy(xpath = "(//body[@id='tinymce'])[1]")
    public WebElement sortDescription;

    @FindBy(xpath = "//body[@id='tinymce']")
    public WebElement descriptionInput;

    @FindBy(xpath = "//*[@id='tinymce']/p")
    public WebElement verifyTextOfDescription;

    @FindBy(xpath="//*[@id=product_cats_checklist]/li[6]/input")
    public WebElement categoryCheckbox;

    @FindBy(id = "featured_img_display")
    public WebElement addDisplayPhoto;

//    @FindBy(id = "__wp-uploader-id-1")
//    public WebElement selectFilesButton;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement selectFilesButton;

    @FindBy(xpath = "//button[text()='Select']")
    public WebElement selectToUploadButton;

    @FindBy(id = "featured_img_remove_button")
    public WebElement removeImgButton;

    @FindBy(id = "gallery_img_gimage_0_display")
    public WebElement addGalleryPhoto;

//    @FindBy(xpath = "//button[text()='Add to Gallery']")
//    public WebElement addToGallery;

    @FindBy(xpath = "(//button[@type='button'])[83]")
    public WebElement addToGallery;

    @FindBy(id = "gallery_img_gimage_0_remove_button")
    public WebElement removeGalleryImg;

    @FindBy(id = "wcfm_products_simple_submit_button")
    public WebElement productSubmitButton;

    @FindBy(id = "attributes_is_visible_1")
    public WebElement visibleOnTheProductPageCheckbox;
    @FindBy(xpath = "//*[@id='attributes']/div[2]/button[3]")
    public WebElement selectAllButton;
    @FindBy(xpath = "//*[@id='attributes']/div[2]/button[2]")
    public WebElement selectNoneButton;
    @FindBy(linkText = "Add New")
    public WebElement addNewButton2;

    @FindBy(xpath = "//span[@class='wcfmfa fa-arrow-alt-circle-right block-indicator']")
    public WebElement attributesButton;


    @FindBy(xpath = "//*[@id='attributes_is_active_1']")
    public WebElement textNewColor;

    @FindBy(id = "insert-media-button")
    public WebElement addMediaBtn;

    @FindBy(xpath = "//input[@type='button']")
    public WebElement selectFilesBtn;

    @FindBy(id = "attributes_is_active_1")
    public WebElement colorCheckbox;

    @FindBy(id = "attributes_is_active_2")
    public WebElement sizeCheckbox;


}

