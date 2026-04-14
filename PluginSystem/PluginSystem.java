import java.util.*;

// Plugin class implementing Comparable
class Plugin implements Comparable<Plugin> {
    String name;
    String version;

    public Plugin(String name, String version) {
        this.name = name.toLowerCase();
        this.version = version;
    }

    @Override
    public int compareTo(Plugin other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Plugin: " + name + " | Version: " + version;
    }
}

// Plugin Manager class
class PluginManager {
    private Set<String> installedPlugins = new HashSet<>();

    public void installPlugin(String pluginName) {
        if (installedPlugins.add(pluginName.toLowerCase())) {
            System.out.println(pluginName + " installed successfully.");
        } else {
            System.out.println(pluginName + " is already installed.");
        }
    }

    public void removePlugin(String pluginName) {
        if (installedPlugins.remove(pluginName.toLowerCase())) {
            System.out.println(pluginName + " removed successfully.");
        } else {
            System.out.println(pluginName + " not found.");
        }
    }

    public void listPlugins() {
        List<Plugin> pluginList = new ArrayList<>();

        for (String name : installedPlugins) {
            pluginList.add(new Plugin(name, "1.0")); // default version
        }

        Collections.sort(pluginList);

        System.out.println("\nInstalled Plugins:");
        for (Plugin p : pluginList) {
            System.out.println(p);
        }
    }
}

// Main Class
public class PluginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PluginManager manager = new PluginManager();

        while (true) {
            System.out.println("\n1. Install Plugin");
            System.out.println("2. Remove Plugin");
            System.out.println("3. List Plugins");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter plugin name to install: ");
                    String installName = sc.nextLine();
                    manager.installPlugin(installName);
                    break;

                case 2:
                    System.out.print("Enter plugin name to remove: ");
                    String removeName = sc.nextLine();
                    manager.removePlugin(removeName);
                    break;

                case 3:
                    manager.listPlugins();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}