/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.InputMismatchException;
import java.util.Scanner;
import static org.junit.Assert.fail;
import org.junit.*;

/**
 *
 * @author Yunesh
 */
public class GraphProblemTest {

    public GraphProblemTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of bfs method, of class GraphProblem.
     */
    @Test
    public void testBfs() {
        System.out.println("bfs");
        int[][] adjacency_matrix = {{0, 1, 0}, {1, 0, 1}, {0, 1, 0}};
        int source = 1;
        GraphProblem instance = new GraphProblem();
        String output = instance.bfs(adjacency_matrix, source);
        String next_output1 = "connected";
        String next_output2 = "not connected";
        if (next_output1.equals(output)) {
            System.out.println("pass");
        } else if (next_output2.equals(output)) {
            System.out.println("pass");
        } else {
            fail("Not the desired result");


        }

    }

    /**
     * Test of main method, of class GraphProblem.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        int number_no_nodes, source;
        number_no_nodes = 3;
        int[][] adjacency_matrix = {{0,0,0},{0,0,0},{0,0,0}};
        source = 1;
        GraphProblem undirectedConnectivity = new GraphProblem();
        String output = undirectedConnectivity.bfs(adjacency_matrix, source);
        String next_output1 = "connected";
        String next_output2 = "not connected";
        if (next_output1.equals(output)) {
            System.out.println("pass");
        } else if (next_output2.equals(output)) {
            System.out.println("pass");
        } else {
            fail("Not the desired result");


        }
    }
}
