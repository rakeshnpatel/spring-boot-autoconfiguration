# spring-boot-autoconfiguration
Basic example of how to apply  auto configuration with spring boot

Run the ```autoconfigure-main-sample```, you will see the output on console printed as **Registered Bean: from autoconfigure-main-sample**

To test that if you do not provide TestBean in the main application, the one (default) will be added from ```autoconfigure-provider-sample``` project, comment the bean declaration from ```MainOverrideConfiguration``` class

Run the ```autoconfigure-main-sample```, you will see the output on console printed as **Registered Bean: from autoconfigure-provider-sample**