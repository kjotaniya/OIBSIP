package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {

    EditText display;
    Button one,two,three,four,five,six,seven,eight,nine,doublezero,zero,add,sub,mul,div,mod,point,clear,equla,back;
    StringBuffer content = new StringBuffer("");
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        doublezero = findViewById(R.id.doublezero);
        zero = findViewById(R.id.zero);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        mod = findViewById(R.id.mod);
        point = findViewById(R.id.point);
        back = findViewById(R.id.back);
        clear = findViewById(R.id.clear);
        equla = findViewById(R.id.equal);
        display = findViewById(R.id.display);
        answer = findViewById(R.id.answer);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!answer.getText().toString().equals(""))
                {
                    display.setText(answer.getText().toString());
                    answer.setText("");
                }
                content.append("1");
                display.setText(content.toString());
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!answer.getText().toString().equals(""))
                {
                    display.setText(answer.getText().toString());
                    answer.setText("");
                }
                content.append("2");
                display.setText(content.toString());
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!answer.getText().toString().equals(""))
                {
                    display.setText(answer.getText().toString());
                    answer.setText("");
                }
                content.append("3");
                display.setText(content.toString());
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!answer.getText().toString().equals(""))
                {
                    display.setText(answer.getText().toString());
                    answer.setText("");
                }
                content.append("4");
                display.setText(content.toString());
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!answer.getText().toString().equals(""))
                {
                    display.setText(answer.getText().toString());
                    answer.setText("");
                }
                content.append("5");
                display.setText(content.toString());
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!answer.getText().toString().equals(""))
                {
                    display.setText(answer.getText().toString());
                    answer.setText("");
                }
                content.append("6");
                display.setText(content.toString());
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!answer.getText().toString().equals(""))
                {
                    display.setText(answer.getText().toString());
                    answer.setText("");
                }
                content.append("7");
                display.setText(content.toString());
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!answer.getText().toString().equals(""))
                {
                    display.setText(answer.getText().toString());
                    answer.setText("");
                }
                content.append("8");
                display.setText(content.toString());
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!answer.getText().toString().equals(""))
                {
                    display.setText(answer.getText().toString());
                    answer.setText("");
                }
                content.append("9");
                display.setText(content.toString());
            }
        });
        doublezero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!answer.getText().toString().equals(""))
                {
                    display.setText(answer.getText().toString());
                    answer.setText("");
                }
                content.append("00");
                display.setText(content.toString());
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!answer.getText().toString().equals(""))
                {
                    display.setText(answer.getText().toString());
                    answer.setText("");
                }
                content.append("0");
                display.setText(content.toString());
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View view) {
                if (isLastCharNumeric(content) && isLopIndex(content)) {
                    content.append(".");
                    display.setText(content.toString());
                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View view) {
                if (isLastCharNumeric(content)) {
                    if (!answer.getText().toString().equals(""))
                    {
                        display.setText(answer.getText().toString());
                        answer.setText("");
                    }

                    content.append("+");
                    display.setText(content.toString());
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View view) {
                if (isLastCharNumeric(content)) {
                    if (!answer.getText().toString().equals(""))
                    {
                        display.setText(answer.getText().toString());
                        answer.setText("");
                    }

                    content.append("-");
                    display.setText(content.toString());
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View view) {
                if (isLastCharNumeric(content)) {
                    if (!answer.getText().toString().equals(""))
                    {
                        display.setText(answer.getText().toString());
                        answer.setText("");
                    }

                    content.append("*");
                    display.setText(content.toString());
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View view) {
                if (isLastCharNumeric(content)) {
                    if (!answer.getText().toString().equals(""))
                    {
                        display.setText(answer.getText().toString());
                        answer.setText("");
                    }

                    content.append("/");
                    display.setText(content.toString());
                }
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isLastCharNumeric(content)){
                    if (!answer.getText().toString().equals(""))
                    {
                        display.setText(answer.getText().toString());
                        answer.setText("");
                    }
                    content.append("%");
                    display.setText(content.toString());
                }
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View view) {
                if(content.length()>0)
                {
                    content.deleteCharAt(content.length()-1);
                    display.setText(content.toString());
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View view) {
                content=new StringBuffer("");
                display.setText(content.toString());
                answer.setText(content.toString());
            }
        });

        equla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (content.charAt(content.length()-1)=='+' || content.charAt(content.length()-1)=='-' || content.charAt(content.length()-1)=='*' || content.charAt(content.length()-1)=='/' || content.charAt(content.length()-1)=='%' )
                {
                    Toast.makeText(MainActivity.this, "Invalid", Toast.LENGTH_SHORT).show();
                }
                else {
                    ScriptEngineManager engineManager = new ScriptEngineManager();
                    ScriptEngine engine = engineManager.getEngineByName("rhino");
                    try {
                        Object ans = engine.eval(content.toString());
                        content = new StringBuffer(ans.toString());
                        answer.setText(content);
                        display.setText("");
                    } catch (ScriptException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    public boolean isLastCharNumeric(StringBuffer sb) {
        if (sb.length() > 0)
        {
            if (sb.charAt(sb.length() - 1) == '+' || sb.charAt(sb.length() - 1) == '-' || sb.charAt(sb.length() - 1) == '*' || sb.charAt(sb.length() - 1) == '/' || sb.charAt(sb.length() - 1) == '%' || sb.charAt(sb.length() - 1) == '.')
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else
        {
            return false;
        }
    }

    public int getOperatorIndex(StringBuffer sb1){
        int add = sb1.lastIndexOf("+");
        int sub = sb1.lastIndexOf("-");
        int mul = sb1.lastIndexOf("*");
        int div = sb1.lastIndexOf("/");
        int mod = sb1.lastIndexOf("%");
        int point = sb1.lastIndexOf(".");

        if (add>sub && add>mul && add>div && add>mod)
        {
            return add;
        }
        else if(sub>add && sub>mul && sub>div && sub>mod)
        {
            return sub;
        }
        else if (mul>add && mul>sub && mul>div && mul>mod)
        {
            return mul;
        }
        else if (div>add && div>sub && div>mul && div>mod)
        {
            return div;
        }
        else if (mod>add && mod>sub && mod>mul && mod>div)
        {
            return mod;
        }
        else if (point>add && point>sub && point>mul && point>div && point>mod)
        {
            return point;
        }
        else
        {
            return 0;
        }
    }

    public boolean isLopIndex(StringBuffer sb)
    {
        if (sb.substring(getOperatorIndex(sb),sb.length()-1).contains("."))
        {
            return false;
        }
        else
        {
            return true;
        }
    }

}

