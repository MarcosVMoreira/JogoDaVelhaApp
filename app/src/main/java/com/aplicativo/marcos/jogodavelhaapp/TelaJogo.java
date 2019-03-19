package com.aplicativo.marcos.jogodavelhaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class TelaJogo extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    Button botao1, botao2, botao3, botao4, botao5, botao6, botao7, botao8, botao9;
    Switch switch1;
    int jogadorAtual;

    int matriz[][] = new int[3][3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_jogo);

        jogadorAtual = 1;

        botao1 = findViewById(R.id.button);
        botao2 = findViewById(R.id.button2);
        botao3 = findViewById(R.id.button3);
        botao4 = findViewById(R.id.button4);
        botao5 = findViewById(R.id.button5);
        botao6 = findViewById(R.id.button6);
        botao7 = findViewById(R.id.button7);
        botao8 = findViewById(R.id.button8);
        botao9 = findViewById(R.id.button9);

        switch1 = findViewById(R.id.switch1);

        switch1.setOnCheckedChangeListener(this);


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                    matriz[i][j] = 0;
            }
        }

        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificaBotao(botao1, 1);
            }
        });

        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificaBotao(botao2, 2);
            }
        });

        botao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificaBotao(botao3, 3);
            }
        });

        botao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificaBotao(botao4, 4);
            }
        });

        botao5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificaBotao(botao5, 5);
            }
        });

        botao6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificaBotao(botao6, 6);
            }
        });

        botao7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificaBotao(botao7, 7);
            }
        });

        botao8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificaBotao(botao8, 8);
            }
        });

        botao9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificaBotao(botao9, 9);
            }
        });
    }

    public void verificaBotao (Button botao, int nBotao) {
        if (botao.getText() == "") {
            if (jogadorAtual == 1) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (matriz[i][j] == 1) {
                            matriz[i][j] = 0;
                        }
                    }
                }
                switch(nBotao) {
                    case 1: matriz[0][0] = 1;
                        break;
                    case 2: matriz[0][1] = 1;
                        break;
                    case 3: matriz[0][2] = 1;
                        break;
                    case 4: matriz[1][0] = 1;
                        break;
                    case 5: matriz[1][1] = 1;
                        break;
                    case 6: matriz[1][2] = 1;
                        break;
                    case 7: matriz[2][0] = 1;
                        break;
                    case 8: matriz[2][1] = 1;
                        break;
                    case 9: matriz[2][2] = 1;
                        break;
                }
            } else {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (matriz[i][j] == 3) {
                            matriz[i][j] = 0;
                        }
                    }
                }

                switch(nBotao) {
                    case 1: matriz[0][0] = 3;
                        break;
                    case 2: matriz[0][1] = 3;
                        break;
                    case 3: matriz[0][2] = 3;
                        break;
                    case 4: matriz[1][0] = 3;
                        break;
                    case 5: matriz[1][1] = 3;
                        break;
                    case 6: matriz[1][2] = 3;
                        break;
                    case 7: matriz[2][0] = 3;
                        break;
                    case 8: matriz[2][1] = 3;
                        break;
                    case 9: matriz[2][2] = 3;
                        break;
                }
            }

            atualizaValores();
        }

    }

    public void atualizaValores () {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0 && j == 0) {
                    switch (matriz[i][j]) {
                        case 0:
                            botao1.setText("");
                            break;
                        case 1:
                            botao1.setText("X");
                            break;
                        case 2:
                            botao1.setText("X");
                            break;
                        case 3:
                            botao1.setText("O");
                            break;
                        case 4:
                            botao1.setText("O");
                            break;
                    }

                } else if (i == 0 && j == 1) {
                    switch (matriz[i][j]) {
                        case 0:
                            botao2.setText("");
                            break;
                        case 1:
                            botao2.setText("X");
                            break;
                        case 2:
                            botao2.setText("X");
                            break;
                        case 3:
                            botao2.setText("O");
                            break;
                        case 4:
                            botao2.setText("O");
                            break;
                    }
                } else if (i == 0 && j == 2) {
                    switch (matriz[i][j]) {
                        case 0:
                            botao3.setText("");
                            break;
                        case 1:
                            botao3.setText("X");
                            break;
                        case 2:
                            botao3.setText("X");
                            break;
                        case 3:
                            botao3.setText("O");
                            break;
                        case 4:
                            botao3.setText("O");
                            break;
                    }
                } else if (i == 1 && j == 0) {
                    switch (matriz[i][j]) {
                        case 0:
                            botao4.setText("");
                            break;
                        case 1:
                            botao4.setText("X");
                            break;
                        case 2:
                            botao4.setText("X");
                            break;
                        case 3:
                            botao4.setText("O");
                            break;
                        case 4:
                            botao4.setText("O");
                            break;
                    }
                } else if (i == 1 && j == 1) {
                    switch (matriz[i][j]) {
                        case 0:
                            botao5.setText("");
                            break;
                        case 1:
                            botao5.setText("X");
                            break;
                        case 2:
                            botao5.setText("X");
                            break;
                        case 3:
                            botao5.setText("O");
                            break;
                        case 4:
                            botao5.setText("O");
                            break;
                    }
                } else if (i == 1 && j == 2) {
                    switch (matriz[i][j]) {
                        case 0:
                            botao6.setText("");
                            break;
                        case 1:
                            botao6.setText("X");
                            break;
                        case 2:
                            botao6.setText("X");
                            break;
                        case 3:
                            botao6.setText("O");
                            break;
                        case 4:
                            botao6.setText("O");
                            break;
                    }
                } else if (i == 2 && j == 0) {
                    switch (matriz[i][j]) {
                        case 0:
                            botao7.setText("");
                            break;
                        case 1:
                            botao7.setText("X");
                            break;
                        case 2:
                            botao7.setText("X");
                            break;
                        case 3:
                            botao7.setText("O");
                            break;
                        case 4:
                            botao7.setText("O");
                            break;
                    }
                } else if (i == 2 && j == 1) {
                    switch (matriz[i][j]) {
                        case 0:
                            botao8.setText("");
                            break;
                        case 1:
                            botao8.setText("X");
                            break;
                        case 2:
                            botao8.setText("X");
                            break;
                        case 3:
                            botao8.setText("O");
                            break;
                        case 4:
                            botao8.setText("O");
                            break;
                    }
                } else if (i == 2 && j == 2) {
                    switch (matriz[i][j]) {
                        case 0:
                            botao9.setText("");
                            break;
                        case 1:
                            botao9.setText("X");
                            break;
                        case 2:
                            botao9.setText("X");
                            break;
                        case 3:
                            botao9.setText("O");
                            break;
                        case 4:
                            botao9.setText("O");
                            break;
                    }
                }
            }
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (jogadorAtual == 1) {
            jogadorAtual = 2;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matriz[i][j] == 1) {
                        matriz[i][j] = 2;
                    }
                }
            }

            verificaVencedor();
        } else {
            jogadorAtual = 1;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matriz[i][j] == 3) {
                        matriz[i][j] = 4;
                    }
                }
            }

            verificaVencedor();
        }
    }

    public void verificaVencedor () {
        if (((matriz[0][0] == matriz [0][1]) && (matriz [0][1] == matriz[0][2]) && (matriz[0][2]) == 2) ||
                ((matriz[1][0] == matriz [1][1]) && (matriz [1][1] == matriz[1][2]) && (matriz[1][2]) == 2) ||
                ((matriz[2][0] == matriz [2][1]) && (matriz [2][1] == matriz[2][2]) && (matriz[2][2]) == 2) ||

                ((matriz[0][0] == matriz [1][0]) && (matriz [1][0] == matriz[2][0]) && (matriz[2][0]) == 2) ||
                ((matriz[0][1] == matriz [1][1]) && (matriz [1][1] == matriz[2][1]) && (matriz[2][1]) == 2) ||
                ((matriz[0][2] == matriz [1][2]) && (matriz [1][2] == matriz[2][2]) && (matriz[2][2]) == 2) ||

                ((matriz[0][0] == matriz [1][1]) && (matriz [1][1] == matriz[2][2]) && (matriz[2][2]) == 2) ||
                ((matriz[0][2] == matriz [1][1]) && (matriz [1][1] == matriz[2][0]) && (matriz[2][0]) == 2)
                ) {

                Toast.makeText(getApplicationContext(), "Player 1 ganhou", Toast.LENGTH_LONG).show();

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        matriz[i][j] = 0;
                    }
                }

                atualizaValores();

        } else if (((matriz[0][0] == matriz [0][1]) && (matriz [0][1] == matriz[0][2]) && (matriz[0][2]) == 4) ||
                ((matriz[1][0] == matriz [1][1]) && (matriz [1][1] == matriz[1][2]) && (matriz[1][2]) == 4) ||
                ((matriz[2][0] == matriz [2][1]) && (matriz [2][1] == matriz[2][2]) && (matriz[2][2]) == 4) ||

                ((matriz[0][0] == matriz [1][0]) && (matriz [1][0] == matriz[2][0]) && (matriz[2][0]) == 4) ||
                ((matriz[0][1] == matriz [1][1]) && (matriz [1][1] == matriz[2][1]) && (matriz[2][1]) == 4) ||
                ((matriz[0][2] == matriz [1][2]) && (matriz [1][2] == matriz[2][2]) && (matriz[2][2]) == 4) ||

                ((matriz[0][0] == matriz [1][1]) && (matriz [1][1] == matriz[2][2]) && (matriz[2][2]) == 4) ||
                ((matriz[0][2] == matriz [1][1]) && (matriz [1][1] == matriz[2][0]) && (matriz[2][0]) == 4)
                ) {

            Toast.makeText(getApplicationContext(), "Player 2 ganhou", Toast.LENGTH_LONG).show();

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matriz[i][j] = 0;
                }
            }

            atualizaValores();

        }
    }
}
