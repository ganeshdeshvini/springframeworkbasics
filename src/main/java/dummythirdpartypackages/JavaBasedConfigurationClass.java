package dummythirdpartypackages;

public class JavaBasedConfigurationClass {
    public JavaBasedConfigurationClass() {
        System.out.println(JavaBasedConfigurationClass.class.getName() + " created!!!");
    }

    public String greet() {
        return JavaBasedConfigurationClass.class.getName() + " loaded using JavaBased configuration";
    }
}
