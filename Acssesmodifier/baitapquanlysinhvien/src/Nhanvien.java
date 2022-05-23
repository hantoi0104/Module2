public class Nhanvien {
        private int id;
        private String name;
        private byte age;
        private String address;

        public Nhanvien(int id, String name, byte age, String address) {
                this.id = id;
                this.name = name;
                this.age = age;
                this.address = address;
        }

        public int getId() {
                return id;
        }

        public String getName() {
                return name;
        }

        public byte getAge() {
                return age;
        }

        public String getAddress() {
                return address;
        }

        public void setId(int id) {
                this.id = id;
        }

        public void setName(String name) {
                this.name = name;
        }

        public void setAge(byte age) {
                this.age = age;
        }

        public void setAddress(String address) {
                this.address = address;
        }
}
