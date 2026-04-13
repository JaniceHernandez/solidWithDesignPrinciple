public class NewsPaper implements LibraryResource {

    private String title;

    public NewsPaper(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void borrow() {
        System.out.println("a newspaper entitled " + title);
    }
}