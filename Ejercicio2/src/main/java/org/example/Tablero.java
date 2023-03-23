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

public class Tablero{

    private static int DIMENSION = 30;
    private int[][] estadoActual;
    private int[][] estadoSiguiente = new int[DIMENSION][DIMENSION];

    public void leerEstadoActual(){
        estadoActual = new int[DIMENSION][DIMENSION];
        for (int i = 0; i < DIMENSION; i++){
            for (int j = 0; j < DIMENSION; j++){
                estadoActual[i][j] = 0;
            }
        }
    }

    public void generarEstadoActualPorMontecarlo(){
        for (int i = 0; i < DIMENSION; i++){
            for (int j = 0; j < DIMENSION; j++){
                estadoActual[i][j] = (int) (Math.random() * 2);
            }
        }
    }
}

