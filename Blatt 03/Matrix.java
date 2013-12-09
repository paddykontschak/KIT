/**
 * A class representing a Matrix of double values. 
 * The index of the top-left value is always (0,0) 
 * and that of the bottom-right corner is (m-1,n-1). 
 * It supports selected manipulation functions and matrix operations.
 * @author Patrick Kontschak
 * @version <enter version here>
 */
class Matrix {
        /**
         * Stores the values of the matrix, such that 
         * the first index represents the row and
         * the second index represents the column.
         */
        int rows;
        int columns;
        double[][] values;

        /**
         * Initializes the matrix with the given number of rows and columns. 
         * Sets all values to zero.
         * @param m the number of rows of the matrix
         * @param n the number of columns of the matrix
         */
        Matrix(int m, int n) {
          rows = m;
          columns = n;
          values = new double[rows][columns];
          return values;
        }

        /**
         * Sets the value of the matrix at the given position.
         * @param i identifies the <code>i</code>-th row
         * @param j identifies the <code>j</code>-th column
         * @param value the value to be set at row <code>i</code> and column <code>j</code>
         */
        void put(int i, int j, double value) {
          rows = i;
          columns = j;
          values = new double[rows][columns];
          int a;
          int b;
          for (a = 0; a < rows; a++) {
            for (b = 0; b < columns; b++) {
              values[a][b] = value;
            }
          }
        }

        /**
         * Returns the value of the matrix at the given position.
         * @param i identifies the <code>i</code>-th row
         * @param j identifies the <code>j</code>-th column
         * @return the value of the matrix at row i and column j
         */
        double get(int i, int j) {
          return values[i][j];
        }

        /**
         * Returns the number of rows.
         * @return the height of the matrix
         */
        int getNumberOfRows() {
          return rows;
        }

        /**
         * Returns the number of columns.
         * @return the width of the matrix
         */
        int getNumberOfColumns() {
          return columns;
        }

        /**
         * Calculates the matrix-product of this matrix with the matrix <code>factor</code>.
         * If possible, i.e. if <code>this.getNumberOfColumns() == factor.getNumberOfRows()</code>, 
         * this method returns the matrix-product, otherwise it returns <code>null</code>. 
         * Neither this matrix nor the matrix <code>factor</code> are modified by this operation. 
         * @param factor The second factor in the product
         * @return the product of this matrix and the matrix <code>factor</code> if it exits, 
         * <code>null</code> otherwise
         */
        Matrix times(Matrix factor) {
          if (rows == factor.rows && columns == factor.columns) {
            Matrix result = new Matrix(rows, columns);
            double[][] d = new double[rows][columns];
            for (int i = 0; i < rows; ++i) {
              for (int j = 0; j < columns; ++j) {
                d[i][j] = values[i][j] + factor.values[i][j];
              }
            }
            return result;
          }
          return null;
        }

        /**
         * Calculates and returns the transposed matrix of the current matrix.
         * This matrix is not modified by the operation. 
         * @return this matrix transposed
         */
        Matrix transpose() {
          Matrix t = new Matrix(columns, rows);
          int i;
          int j;
          for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
              t.values[j][i] = this.values[i][j];
            }
          }
          return t;
        }
}
