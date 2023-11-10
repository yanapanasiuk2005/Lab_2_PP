package Task3;

public class Plane {
    private String company;
    private String model;

    private String status;

    public Plane(String company, String model, String status) {
        this.company = company;
        this.model = model;
        this.status = status;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void editStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "\nfrom company " + company + '\n' +
                "model : " + model + '\n' +
                "status : " + status + '\n';
    }
}
