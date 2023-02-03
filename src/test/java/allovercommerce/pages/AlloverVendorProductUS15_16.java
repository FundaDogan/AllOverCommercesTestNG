package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public class AlloverVendorProductUS15_16 {


    public AlloverVendorProductUS15_16() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Mustafa US_15_TC_01=============================================================================================================
    @FindBy(linkText = "Store Manager")
    public WebElement storeMenagerButton;

    @FindBy(linkText = "Products")
    public WebElement productsButton;

    @FindBy(linkText = "Add New")
    public WebElement addNewButton1;

    @FindBy(className = "page_collapsible_content_holder")
    public WebElement inventoryButton;
//    @FindBy( id = "wcfm_products_manage_form_shipping_head")
//    public WebElement shippingButton;


    @FindBy(xpath = "//div[@class='page_collapsible_content_holder']")
    public List<WebElement> menuList;

//Mustafa US_15_TC_01=============================================================================================================
//Mustafa US_15_TC_02=============================================================================================================

    @FindBy(id = "sku")
    public WebElement skuUnit;

    @FindBy(id = "manage_stock")
    public WebElement manageStockCheckbox;

    @FindBy(xpath = "//*[@id='stock_qty']")
    public WebElement stockQuantity;

    @FindBy(id = "sold_individually")
    public WebElement soldIndividuallyChekbox;

    @FindBy(xpath = "//select[@id='backorders']")
    public WebElement allowBackordersDropDownMenu;
//Mustafa US_15_TC_02=============================================================================================================

    //   US_15_TC_03=============================================================================================================
    @FindBy(xpath = "//*[@id='wcfm_products_manage_form_shipping_head']")
    public WebElement shippingButton;

    @FindBy(id = "weight")
    public WebElement weight;

    @FindBy(id = "length")
    public WebElement length;

    @FindBy(id = "width")
    public WebElement width;

    @FindBy(id = "height")
    public WebElement height;

    @FindBy(id = "shipping_class")
    public WebElement shippingClasses;

    @FindBy(id = "_wcfmmp_processing_time")
    public WebElement proccesingTime;
//Mustafa US_15_TC_03=============================================================================================================


//Mustafa US_15_TC_04=============================================================================================================

    //    @FindBy(className= "wcfmfafa-arrow-alt-circle-right block-indicator")
//    public WebElement attributesButton;
    @FindBy(id = "wcfm_products_manage_form_attribute_head")
    public WebElement attributesButton;

    @FindBy(xpath = "//*[@id='attributes_is_active_1']")
    public WebElement colorCheckbox;

    @FindBy(id = "attributes_is_visible_1")
    public WebElement visibleOnTheProductPageCheckbox;

//    @FindBy(xpath= "//*[@id='attributes']/div[2]/button[3]")
//    public WebElement selectAllButton;


    @FindBy(xpath = "(//button[@class='button wcfm_add_attribute_term wcfm_select_all_attributes'])[1]")
    public WebElement selectAllButton1;
    //*[@id="attributes"]/div[2]/button[3]
    @FindBy(xpath = "(//button[@class='button wcfm_add_attribute_term wcfm_select_no_attributes'])[1]")
    public WebElement selectNoneButton1;
    //*[@id="attributes"]/div[2]/button[2]
    @FindBy(xpath = "//*[@id='attributes']/div[2]/button[1]")
    public WebElement addNewButtonColor;

    @FindBy(xpath = "//li[@class='select2-results__option']")
    public WebElement colorDropdown;


    // @FindBy(id= "attributes_is_active_1']")
    //  public  WebElement colorClose;

    @FindBy(xpath = "//input[@name='attributes[1][is_visible]']")
    public WebElement colorClose;


    @FindBy(id = "wcfm_products_simple_submit_button")
    public WebElement colorSubmitButton;


    @FindBy(id = "attributes_is_active_2")
    public WebElement sizeCheckbox;

    @FindBy(xpath = "(//button[@class='button wcfm_add_attribute_term wcfm_select_all_attributes'])[2]")
    public WebElement selectAllButton2;

    @FindBy(xpath = "(//button[@class='button wcfm_add_attribute_term wcfm_select_no_attributes'])[2]")
    public WebElement selectNoneButton2;

    @FindBy(xpath = "(//button[@class='button wcfm_add_attribute_term wcfm_add_attributes_new_term'])[2]")
    public WebElement addNewButtonSize;

    @FindBy(xpath = "//*[@id='attributes']/div[3]/span[2]/span[1]/span/ul/li/input")
    public WebElement sizeDropdown;

    @FindBy(xpath = "//*[@id=\"wcfm_products_manage_form_attribute_expander\"]/p[2]/button")
    public WebElement addButton;

    @FindBy(xpath = "//*[@id='attributes_name_3']")
    public WebElement nameInput;

    @FindBy(xpath = "//*[@id='attributes_value_3']")
    public WebElement valueInput;


//Mustafa US_15_TC_04=============================================================================================================


    //Mustafa US_15_TC_05=============================================================================================================
    @FindBy(id = "wcfm_products_manage_form_linked_head")
    public WebElement linkedButton;


//Mustafa US_15_TC_05=============================================================================================================

//Mustafa US_15_TC_06=============================================================================================================

    @FindBy(id = "wcfm_products_manage_form_yoast_head")
    public WebElement SEOButton;

    @FindBy(id = "yoast_wpseo_focuskw_text_input")
    public WebElement fokusKeyword;

    @FindBy(id = "yoast_wpseo_metadesc")
    public WebElement metaDescription;


//Mustafa US_15_TC_06=============================================================================================================
//Mustafa US_15_TC_07=============================================================================================================
        @FindBy(id = "wcfm_products_manage_form_toptan-urun-gosterme-ayarlari_head")
         public WebElement wholesaleProductButton;

        @FindBy(xpath = "//select[@name='acf[piecetype]']")
         public WebElement pieceTypeDropdown;

        @FindBy(xpath = "//input[@name='acf[unitpercart]']")
        public WebElement unitsPerPieceInput;

        @FindBy(xpath = "//*[@id='minorderqtytr']")
        public WebElement minOrderQuantityInput;










//Mustafa US_15_TC_07=============================================================================================================

//Mustafa US_15_TC_08=============================================================================================================


    @FindBy(id = "wcfm_products_manage_form_advanced_head")
    public WebElement advanceButton;

    @FindBy(xpath = "//input[@id='menu_order']")
    public WebElement menuOrderInput;

    @FindBy(xpath = "//*[@id='purchase_note']")
    public WebElement purchaseNoteInput;

    @FindBy(xpath = "//*[@id='product_type']")
    public WebElement productTypesDropdown;



    //Mustafa US_15_TC_08=============================================================================================================

    //Mustafa US_16_TC_01=============================================================================================================
 //   Nothing
    //Mustafa US_16_TC_01=============================================================================================================

    //Mustafa US_16_TC_02=============================================================================================================

    @FindBy(xpath = "//*[@id='is_virtual']")
    public WebElement  virtualCheckbox;

    @FindBy(xpath = "//*[@id='is_downloadable']")
    public WebElement downloadableCheckbox;

    //Mustafa US_16_TC_02=============================================================================================================



    //Mustafa US_16_TC_03=============================================================================================================

    @FindBy(xpath = "//*[@id='regular_price']")
    public WebElement  priceInput;

    @FindBy(xpath = "//*[@id='sale_price']")
    public WebElement  salePriceInput;

     //Mustafa US_16_TC_03=============================================================================================================

    //Mustafa US_16_14_TC_01=============================================================================================================

    @FindBy(xpath = "//*[@id='insert-media-button']")
    public WebElement  addMediaUnderShortDescription;

    @FindBy(xpath= "//*[@id='__wp-uploader-id-1']") //id="insert-media-button"
    public WebElement  selectFiles;


  @FindBy(css = "#__wp-uploader-id-0 > div.media-frame-toolbar > div > div.media-toolbar-primary.search-form > button")
    public WebElement  insertIntoPost1;


    @FindBy(xpath = "//*[@id='wp-description-media-buttons']/button/span")
    public WebElement  addMediaUnderDescription;
//*[@id="wp-description-media-buttons"]/button
//*[@id="wp-description-media-buttons"]/button
     @FindBy(xpath= "/html/body/div[20]/div[1]/div/div/div[3]/div[1]/div/button[1]")
     public WebElement  upLoadFiles;

    @FindBy(xpath = "//*[@id='menu-item-browse']")
    public WebElement  allMedia;

    @FindBy(xpath = "//body[@id='tinymce']")
    public WebElement  shortDescription;


    //Mustafa US_16_14_TC_01=============================================================================================================



//Mustafa US_16_14_TC_03=============================================================================================================


    @FindBy(xpath = "//*[@id='pro_title']")
    public WebElement  productTitle;



    //Mustafa US_16_14_TC_03=============================================================================================================
    //Mustafa US_16_14_TC_05=============================================================================================================

    @FindBy(xpath = "//*[@id='wcfm_products_manage_form_general_expander']/div[2]/div[5]/p")
    public WebElement  addNewCategory;

    @FindBy(id = "wcfm_new_cat")
    public WebElement categoryName;

    @FindBy(xpath = "//select[@class='wcfm-select wcfm_new_parent_taxt_ele wcfm_full_ele']")
    public WebElement categoryDropDown;


    //Mustafa US_16_14_TC_05=============================================================================================================

    //Mustafa US_16_14_TC_06=============================================================================================================

    @FindBy(xpath = "//*[@id='product_cats_checklist']/li[1]/input")
    public WebElement categoriesCheckbox;

// div[class="wcfm_product_manager_cats_checklist_fields"]>:nth-child(3)

    //*[@id="product_cats_checklist"]/li[1]





    //Mustafa US_16_14_TC_06=============================================================================================================





}