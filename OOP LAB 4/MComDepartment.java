public class MComDepartment extends Universaty{
        public String mComName;
        public String timeRequired;
        public int fee;

        public MComDepartment(String universityName, String address, int rank, String  mComName, String timeRequired, int fee) {
            super(universityName, address, rank);
            this.mComName = mComName;
            this.timeRequired = timeRequired;
            this.fee = fee;
        }



        @Override
        public String toString() {
            return "\nDepartment Name : "+ this.mComName+
                    "\nTime Required : "+ timeRequired+
                    "\nFee : "+ fee+
                    super.toString();
        }
    }

