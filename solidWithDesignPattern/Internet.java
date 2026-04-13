public class Internet implements LibraryResource {

    private String network;

    public Internet(String network) {
        this.network = network;
    }

    @Override
    public String getTitle() {
        return network;
    }

    @Override
    public void borrow() {
        System.out.println("accessed internet " + network);
    }
}