class DatosFactura {
    private String nombreCliente;
    private String apellidosCliente;
    private int edadCliente;
    private String rutCliente;
    private String nombreEmpresa;
    private String rutEmpresa;
    private String giroEmpresa;

    public DatosFactura(String nombreCliente, String apellidosCliente, int edadCliente, String rutCliente,
                        String nombreEmpresa, String rutEmpresa, String giroEmpresa) {
        this.nombreCliente = nombreCliente;
        this.apellidosCliente = apellidosCliente;
        this.edadCliente = edadCliente;
        this.rutCliente = rutCliente;
        this.nombreEmpresa = nombreEmpresa;
        this.rutEmpresa = rutEmpresa;
        this.giroEmpresa = giroEmpresa;
    }

    @Override
    public String toString() {
        return "Nombre cliente: " + nombreCliente + "\n" +
                "Apellidos cliente: " + apellidosCliente + "\n" +
                "Edad cliente: " + edadCliente + "\n" +
                "RUT cliente: " + rutCliente + "\n" +
                "Nombre empresa: " + nombreEmpresa + "\n" +
                "RUT empresa: " + rutEmpresa + "\n" +
                "Giro empresa: " + giroEmpresa;
    }
}