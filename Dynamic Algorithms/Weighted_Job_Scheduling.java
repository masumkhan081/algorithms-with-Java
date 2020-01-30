/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamic_Algorithm;

/**
 *
 * @author Masum Khan
 */
public class Weighted_Job_Scheduling {

    public static void main(String[] args) {

        int jobs[][] = {{1, 3}, {2, 5}, {4, 6}, {6, 7},
        {5, 8}, {7, 9}};
        int jobValues[] = {5, 6, 5, 4, 11, 2}, i, j, temp;
        int len = jobs.length;

        //   if jobs are not sorted by their end time .
        for (i = 0; i < jobs.length; i++) {
            for (j = i + 1; j < jobs.length; j++) {
                if (jobs[i][1] > jobs[j][1]) {
                    temp = jobs[i][1];
                    jobs[i][1] = jobs[j][1];
                    jobs[j][1] = temp;
                    //
                    temp = jobs[i][0];
                    jobs[i][0] = jobs[j][0];
                    jobs[j][0] = temp;

                    temp = jobValues[i];
                    jobValues[i] = jobValues[j];
                    jobValues[j] = temp;

                }
            }
        }
        int process[] = new int[len];
        for (int k = 0; k < len; k++) {
            process[k] = jobValues[k];
        }

        for (i = 1; i < len; i++) {
            for (j = 0; j < i; j++) {
                if (jobs[j][1] <= jobs[i][0]) {
                    process[i] = Math.max(process[i], jobValues[i] + process[j]);
                }
            }
        }
        int max = 0;
        for (i = 0; i < len; i++) {
            if (max < process[i]) {
                max = process[i];
            }
        }
        System.out.println("Possible Maximum By Picking Jobs: " + max);
    }

}
