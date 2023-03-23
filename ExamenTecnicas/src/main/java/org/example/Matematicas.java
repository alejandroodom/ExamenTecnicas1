/*Copyright [2023] [Alejandro Domínguez Rábano]
        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at
        http://www.apache.org/licenses/LICENSE-2.0
        Unless required by applicable law or agreed to in writing,
        software distributed under the License is distributed on an
        "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
        either express or implied. See the License for the specific
        language governing permissions and limitations under the
        License.
 */
package org.example;
import java.util.Random;
public class Matematicas {
    public static double generarNumeroPi(long pasos){
        Random r = new Random();
        int dentro = 0;
        for(int i = 0; i < pasos; i++){
            double x = r.nextDouble();
            double y = r.nextDouble();
            if(x * x + y * y <= 1) dentro++;
        }
        return 4.0 * dentro/pasos;
    }
}
