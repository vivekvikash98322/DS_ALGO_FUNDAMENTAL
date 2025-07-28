package com.cozzycoder.revision.dataStructure.stack;

import java.util.Objects;

public class SimplfyPath {

    public static void main(String[] args) {
        System.out.println(simplifyPath("/.../a/../b/c/../d/./"));
    }

    public static String simplifyPath(String path) {
        String [] paths = path.split("/");

        for (int i = 0; i < paths.length; i++) {

            if(Objects.equals(paths[i], "..")) {
                paths[i] = "";
                paths[i - 1] = "";
                continue;
            } else if (!paths[i].isEmpty() && !paths[i].equals(".")) {
                continue;
            }

            paths[i] = "";
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/");


        for (String val : paths) {
            if(!val.isEmpty()) {
                stringBuilder.append(val).append("/");
            }
        }

        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();

    }
}
