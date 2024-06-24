package A01;
import java.util.*;

public class Backtracking02 {
    public int maze2Direction(int sr, int sc, int er, int ec){
        if(sr > er || sc > ec){
            return 0;
        }
        if(sr == er && sc == ec){
            return 1;
        }

        int downWays = maze2Direction(sr + 1, sc, er, ec);
        int rightWays = maze2Direction(sr, sc + 1, er, ec);

        int totalWays = downWays + rightWays;
        return totalWays;
    }

    public void maze2DirectionPrint(int sr, int sc, int er, int ec, String s){
        if(sr > er || sc > ec){
            return;
        }
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }

        // right
        maze2DirectionPrint(sr, sc + 1, er, ec, s + "R");
        // down
        maze2DirectionPrint(sr + 1, sc, er, ec, s + "D");
    }

    public void maze4DirectionPrint(int sr, int sc, int er, int ec, String s, boolean [][] isVisited){
        if(sr < 0 || sc < 0){
            return;
        }
        if(sr > er || sc > ec){
            return;
        }
        if(isVisited[sr][sc] == true){
            return;
        }
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;
        // Right
        maze4DirectionPrint(sr, sc + 1, er, ec, s + "R", isVisited);
        // Down
        maze4DirectionPrint(sr + 1, sc, er, ec, s + "D", isVisited);
        // Left
        maze4DirectionPrint(sr, sc - 1, er, ec, s + "L", isVisited);
        // Up
        maze4DirectionPrint(sr - 1, sc, er, sc, s + "U", isVisited);
        isVisited[sr][sc] = false;
    }

    public void maze2DirectionPrintAdvanced(int sr, int sc, int er, int ec, String s, int [][]maze){
        if(sr > er || sc > ec){
            return;
        }
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc] == 0){
            return;
        }
        maze2DirectionPrintAdvanced(sr, sc + 1, er, ec, s + "R", maze);
        maze2DirectionPrintAdvanced(sr + 1, sc, er, ec, s + "D", maze);

    }

    public List<List<Integer>> permute(int []nums){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean []isValid = new boolean[nums.length];
        helper(nums, ds, isValid, ans);
        return ans;
    }

    public void helper(int []nums, List<Integer> ds, boolean []isValid, List<List<Integer>> ans){
        int n = nums.length;
        if(ds.size() == n){
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < ds.size(); i++){
                list.add(ds.get(i));
            }
            ans.add(list);
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(isValid[i] == false){
                ds.add(nums[i]);
                helper(nums, ds, isValid, ans);
                isValid[i] = false;
                ds.remove(ds.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Backtracking02 obj = new Backtracking02();
//        System.out.println(obj.maze2Direction(1, 1, 2, 2));

//        obj.maze2DirectionPrint(1, 1, 3, 3, "");

//        int rows = 3;
//        int cols = 3;
//        boolean [][]isVisited = new boolean[rows][cols];
//        obj.maze4DirectionPrint(0, 0, rows - 1, cols - 1, "", isVisited);

        int rows = 4;
        int cols = 6;
        int [][]maze = {
                {1, 0, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 1},
                {0, 1, 1, 1, 1, 1},
                {0, 0, 1, 0, 1, 1},
        };
        obj.maze2DirectionPrintAdvanced(0, 0, rows - 1, cols - 1, "", maze);

    }
}

