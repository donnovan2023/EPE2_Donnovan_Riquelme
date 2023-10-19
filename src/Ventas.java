public class Ventas {
        private int totalVentas;
        private double montoVentas;

        public Ventas(int totalVentas, double montoVentas) {
            this.totalVentas = totalVentas;
            this.montoVentas = montoVentas;
        }

        public double calcularIvaAPagar() {
            return montoVentas * 0.19;
        }

        public double calcularUtilidades() {
            double ivaAPagar = calcularIvaAPagar();
            return montoVentas - ivaAPagar;
        }
    }

