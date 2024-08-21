package assignmentClasses;

import java.time.LocalDate;

public class Sales extends Bookings{

    public Sales(String customer_id, LocalDate date, Double payment) {
        super(customer_id, null, null, date, null, payment, null );
    }
}
