import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {
    @GetMapping("/dashboard")
    public DashboardData getDashboardData() {
        DashboardData data = new Dashboarpublic class DashboardData {

            private int totalEmployees;
            private int checkedIn;
            private int notCheckedIn;
            private int onLeave;
            private int weeklyOff;
            private int holiday;
            private int checkedOut;



            public int getTotalEmployees() {
                return totalEmployees;
            }

            public void setTotalEmployees(int totalEmployees) {
                this.totalEmployees = totalEmployees;
            }

            public int getCheckedIn() {
                return checkedIn;
            }

            public void setCheckedIn(int checkedIn) {
                this.checkedIn = checkedIn;
            }

            public int getNotCheckedIn() {
                return notCheckedIn;
            }

            public void setNotCheckedIn(int notCheckedIn) {
                this.notCheckedIn = notCheckedIn;
            }

            public int getOnLeave() {
                return onLeave;
            }

            public void setOnLeave(int onLeave) {
                this.onLeave = onLeave;
            }

            public int getWeeklyOff() {
                return weeklyOff;
            }

            public void setWeeklyOff(int weeklyOff) {
                this.weeklyOff = weeklyOff;
            }

            public int getHoliday() {
                return holiday;
            }

            public void setHoliday(int holiday) {
                this.holiday = holiday;
            }

            public int getCheckedOut() {
                return checkedOut;
            }

            public void setCheckedOut(int checkedOut) {
                this.checkedOut = checkedOut;
            }
        }

        dData();
        data.setTotalEmployees(5000);
        data.setCheckedIn(4500);
        data.setNotCheckedIn(500);
        data.setOnLeave(456);
        data.setWeeklyOff(145);
        data.setHoliday(12);
        data.setCheckedOut(250);

        return data;
    }
}
