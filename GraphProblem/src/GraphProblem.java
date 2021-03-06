    import java.util.InputMismatchException;

    import java.util.LinkedList;

    import java.util.Queue;

    import java.util.Scanner;

     

    public class GraphProblem

    {

        private Queue<Integer> queue;

     

        public GraphProblem()

        {

            queue = new LinkedList<Integer>();

        }

     

        public String bfs(int adjacency_matrix[][], int source){
        

        {

            int number_of_nodes = adjacency_matrix[source].length - 1;

     

            int[] visited = new int[number_of_nodes + 1];

            int i, element;

            visited[source] = 1;

            queue.add(source);

            while (!queue.isEmpty())

            {

                element = queue.remove();

                i = element;

                while (i <= number_of_nodes)

                {

                    if (adjacency_matrix[element][i] == 1 && visited[i] == 0)

                    {

                        queue.add(i);

                        visited[i] = 1;

                    }

                    i++;

                }

            }  

            boolean connected = false; 

     

            for (int vertex = 1; vertex <= number_of_nodes; vertex++)

            {

                if (visited[vertex] == 1)

                {

                    connected = true;

                } else

                {

                    connected = false;

                    break;

                }

            }

     

            if (connected)

            {

                System.out.println("The graph is connected");
                return ("connected");

            } else

            {

                System.out.println("The graph is disconnected");
                return ("not connected");

            }

        }
        }
     

        public static void main(String... arg){

            int number_no_nodes, source;

            Scanner scanner = null;

     

            try

            {

                System.out.println("Enter the number of nodes in the graph");

                scanner = new Scanner(System.in);

                number_no_nodes = scanner.nextInt();

     

                int adjacency_matrix[][] = new int[number_no_nodes + 1][number_no_nodes + 1];

                System.out.println("Enter the adjacency matrix");

                for (int i = 1; i <= number_no_nodes; i++)

                    for (int j = 1; j <= number_no_nodes; j++)

                        adjacency_matrix[i][j] = scanner.nextInt();

     

                for (int i = 1; i <= number_no_nodes; i++)

                {

                    for (int j = 1; j <= number_no_nodes; j++)

                    {

                        if (adjacency_matrix[i][j] ==  1 && adjacency_matrix[j][i] == 0)

                        {

                            adjacency_matrix[j][i] = 1;

                        }

                    }

                }

     

                System.out.println("Enter the source for the graph");

                source = scanner.nextInt();

     

                GraphProblem undirectedConnectivity= new GraphProblem();

                undirectedConnectivity.bfs(adjacency_matrix, source);

     

            } catch (InputMismatchException inputMismatch)

            {

                System.out.println("Wrong Input Format");

            }

            scanner.close();

        }

    }
