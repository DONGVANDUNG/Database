package service.lesson3.bai31;

import java.sql.Timestamp;

public class LaptopEntity {
    private int id;
    private String name;
    private String url;
    private String maker;
    private String type;
    private String ram;
    private String cpu;
    private String ssd;
    private String hdd;
    private long price;
    private String card;
    private String Screen_resolution;
    private float screen_size;
    private int sold;
    private Timestamp created_timestamp;
    private Timestamp lasted_updated_timestamp;

    public LaptopEntity(int id, String name, String url, String maker, String type, String ram, String cpu, String ssd, String hdd, long price, String card, String screen_resolution, float screen_size, int sold, Timestamp created_timestamp, Timestamp lasted_updated_timestamp) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.maker = maker;
        this.type = type;
        this.ram = ram;
        this.cpu = cpu;
        this.ssd = ssd;
        this.hdd = hdd;
        this.price = price;
        this.card = card;
        Screen_resolution = screen_resolution;
        this.screen_size = screen_size;
        this.sold = sold;
        this.created_timestamp = created_timestamp;
        this.lasted_updated_timestamp = lasted_updated_timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getScreen_resolution() {
        return Screen_resolution;
    }

    public void setScreen_resolution(String screen_resolution) {
        Screen_resolution = screen_resolution;
    }

    public float getScreen_size() {
        return screen_size;
    }

    public void setScreen_size(float screen_size) {
        this.screen_size = screen_size;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public Timestamp getCreated_timestamp() {
        return created_timestamp;
    }

    public void setCreated_timestamp(Timestamp created_timestamp) {
        this.created_timestamp = created_timestamp;
    }

    public Timestamp getLasted_updated_timestamp() {
        return lasted_updated_timestamp;
    }

    public void setLasted_updated_timestamp(Timestamp lasted_updated_timestamp) {
        this.lasted_updated_timestamp = lasted_updated_timestamp;
    }
}

