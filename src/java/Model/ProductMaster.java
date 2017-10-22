
package Model;

public class ProductMaster {
   private int user_id;
   private int P_id;
    private int Quantity;
    private String P_name,P_category,P_type,Price,Brand,image,Description;
    private boolean P_visibile;

    public ProductMaster() {
    }

    public ProductMaster(int user_id,int P_id, int Quantity, String P_name, String P_category, String P_type, String Price, String Brand, String image, String Description, boolean P_visibile) {
        this.user_id=user_id;
        this.P_id = P_id;
        this.Quantity = Quantity;
        this.P_name = P_name;
        this.P_category = P_category;
        this.P_type = P_type;
        this.Price = Price;
        this.Brand = Brand;
        this.image = image;
        this.Description = Description;
        this.P_visibile = P_visibile;
    }

    public ProductMaster(int user_id,int Quantity, String P_name, String P_category, String P_type, String Price, String Brand, String image, String Description, boolean P_visibile) {
        this.user_id=user_id;
        this.Quantity = Quantity;
        this.P_name = P_name;
        this.P_category = P_category;
        this.P_type = P_type;
        this.Price = Price;
        this.Brand = Brand;
        this.image = image;
        this.Description = Description;
        this.P_visibile = P_visibile;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    

    public int getP_Id() {
        return P_id;
    }

    public void setP_Id(int P_id) {
        this.P_id = P_id;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getP_name() {
        return P_name;
    }

    public void setP_name(String P_name) {
        this.P_name = P_name;
    }

    public String getP_category() {
        return P_category;
    }

    public void setP_category(String P_category) {
        this.P_category = P_category;
    }

    public String getP_type() {
        return P_type;
    }

    public void setP_type(String P_type) {
        this.P_type = P_type;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public boolean isP_visibile() {
        return P_visibile;
    }

    public void setP_visibile(boolean P_visibile) {
        this.P_visibile = P_visibile;
    }

    
    
}
