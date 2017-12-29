package ticketinfo;

import java.util.ArrayList;

/**
 * Created by wahaitao on 12/19/2017.
 */

public class RailwayInfo {
    public int imageResId;
    public String trainInfo;
    private String train_no;//车次名称
    private String train_type;//车次类型
    private String start_station;//出发站
    private String start_station_type;//出发站类型
    private String end_station;//到达站
    private String end_station_type;//到达站类型
    private String start_time;//出发时间
    private String end_time;//到达时间
    private String run_time;//运行时间
    private ArrayList<RailwayPrice> price_list;//座位价格
    private String run_distance;
    private String m_chaxun_url;

    public class RailwayPrice{
        String price_type;//座位类型
        String price;//	string	票价

        public String getPrice_type() {
            return price_type;
        }

        public void setPrice_type(String price_type) {
            this.price_type = price_type;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }
    }

    public String getTrain_no() {
        return train_no;
    }

    public void setTrain_no(String train_no) {
        this.train_no = train_no;
    }

    public String getTrain_type() {
        return train_type;
    }

    public void setTrain_type(String train_type) {
        this.train_type = train_type;
    }

    public String getStart_station() {
        return start_station;
    }

    public void setStart_station(String start_station) {
        this.start_station = start_station;
    }

    public String getStart_station_type() {
        return start_station_type;
    }

    public void setStart_station_type(String start_station_type) {
        this.start_station_type = start_station_type;
    }

    public String getEnd_station() {
        return end_station;
    }

    public void setEnd_station(String end_station) {
        this.end_station = end_station;
    }

    public String getEnd_station_type() {
        return end_station_type;
    }

    public void setEnd_station_type(String end_station_type) {
        this.end_station_type = end_station_type;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getRun_time() {
        return run_time;
    }

    public void setRun_time(String run_time) {
        this.run_time = run_time;
    }

    public ArrayList<RailwayPrice> getPrice_list() {
        return price_list;
    }

    public void setPrice_list(ArrayList<RailwayPrice> price_list) {
        this.price_list = price_list;
    }

    public String getRun_distance() {
        return run_distance;
    }

    public void setRun_distance(String run_distance) {
        this.run_distance = run_distance;
    }

    public String getM_chaxun_url() {
        return m_chaxun_url;
    }

    public void setM_chaxun_url(String m_chaxun_url) {
        this.m_chaxun_url = m_chaxun_url;
    }
}
