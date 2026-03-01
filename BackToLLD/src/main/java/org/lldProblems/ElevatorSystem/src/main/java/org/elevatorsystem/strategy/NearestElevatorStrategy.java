package org.elevatorsystem.strategy;

import org.elevatorsystem.model.Elevator;
import org.elevatorsystem.model.Request;

import java.util.List;

public class NearestElevatorStrategy  implements ElevatorSelectionStrategy{


        @Override
        public Elevator selectElevator(List<Elevator> elevators, Request request) {

            // Ye best elevator store karega jo finally select hoga
            Elevator best = null;

            // Initial best score maximum rakhte hain taaki first comparison me replace ho jaye
            int bestScore = Integer.MAX_VALUE;

            // Har elevator ko check karenge
            for (Elevator e : elevators) {

                // 1️⃣ Distance calculate kar rahe hain
                // Matlab elevator current floor se request ke source floor tak kitna door hai
                int distance = Math.abs(e.getCurrentFloor() - request.getSourceFloor());

                // 2️⃣ Load factor check kar rahe hain
                // Kitni pending requests already queue me hain
                int loadFactor = e.getTotalRequests();

                // 3️⃣ Elevator idle hai ya busy?
                boolean isIdle = e.isIdle();

                // 4️⃣ Score calculate karte hain
                // Distance kam ho to better
                // Load zyada ho to penalty denge (loadFactor * 5)
                int score = distance + (loadFactor * 5);

                // Agar elevator idle hai to thoda bonus de dete hain
                // Taaki idle elevator ko preference mile
                if (isIdle) {
                    score -= 3; // Idle bonus
                }

                // 5️⃣ Ab compare karte hain
                // Jo elevator ka score sabse kam hoga wahi best hoga
                if (score < bestScore) {
                    bestScore = score;
                    best = e;
                }
            }

            // Finally best elevator return kar dete hain
            return best;
        }

}
