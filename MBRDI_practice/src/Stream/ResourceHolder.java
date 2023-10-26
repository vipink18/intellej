package Stream;
public class ResourceHolder {
    private String resourceName;

    public ResourceHolder(String resourceName) {
        this.resourceName = resourceName;
    }

    public void openResource() {
        System.out.println("Opening resource: " + resourceName);
        // Code to open the resource
    }

    public void closeResource() {
        System.out.println("Closing resource: " + resourceName);
        // Code to close the resource
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            // Perform cleanup operations
            closeResource();
        } finally {
            super.finalize();
        }
    }

    public static void main(String[] args) {
        ResourceHolder resource = new ResourceHolder("File.txt");
        resource.openResource();

        // Let's assume the resource holder object is no longer used
        resource = null;

        // Trigger garbage collection
        System.gc();
    }
}
