package Question_4;

public class driver {
    public static void main(String[] args) {
        Folder php_demo1    = new Folder("php_demo1");
        Folder source_files = new Folder("Source Files");
        Folder include_path = new Folder("Include Path");
        Folder remote_files = new Folder("Remote Files");


        File htaccess = new File(".htaccess");
        File htrouter = new File(".htrouter.php");
        File index    = new File("index.html");

        Folder phalcon = new Folder(".phalcon");
        Folder cache = new Folder("cache");
        Folder _public = new Folder("public");

        Folder app = new Folder("app");
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("Library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");

        php_demo1.add_sub_folder(source_files);
        php_demo1.add_sub_folder(include_path);
        php_demo1.add_sub_folder(remote_files);

        source_files.add_file(htaccess);
        source_files.add_file(htrouter);
        source_files.add_file(index);

        source_files.add_sub_folder(phalcon);
        source_files.add_sub_folder(app);
        source_files.add_sub_folder(cache);
        source_files.add_sub_folder(_public);

        app.add_sub_folder(config);
        app.add_sub_folder(controllers);
        app.add_sub_folder(library);
        app.add_sub_folder(migrations);
        app.add_sub_folder(models);
        app.add_sub_folder(views);

        source_files.delete(app);
        source_files.delete(_public);

        php_demo1.print_structure();

    }

}
