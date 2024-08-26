public class Product {
    //attribute
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String kod;

    //Constructor
    public Product(int id, String name, String _description, double price, int _stockAmount){
        System.out.println("Yapıcı blok çalıisti");
        this._id = id;
        this._name = name;
        this._description = _description;
        this._price = price;
        this._stockAmount = _stockAmount;
    }

    public Product(){

    }

    //getter
    public int getId(){
        return _id;
    }

    //setter
    public void setId(int id){
        //this.id = id
        _id = id;
    }


    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount(int _stockAmount) {
        this._stockAmount = _stockAmount;
    }

    public String getKod() {
        return this._name.substring(0,1) + _id;
    }


}
