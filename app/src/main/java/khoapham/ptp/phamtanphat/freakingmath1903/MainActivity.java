package khoapham.ptp.phamtanphat.freakingmath1903;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtSothu1,txtSothu2,txtPheptoan,txtKetqua;
    ImageButton imgDung,imgSai;
    int ketqua = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();

        Random random = new Random();
        int sth1 = random.nextInt(9) + 1;
        int sth2 = random.nextInt(9) + 1;

        int indexpheptinh = random.nextInt(4);

        switch (indexpheptinh){
            case 0 : ketqua = sth1 + sth2;
                txtPheptoan.setText(" + ");
                break;
            case 1 : ketqua = sth1 - sth2;
                txtPheptoan.setText(" - ");
                break;
            case 2 : ketqua = sth1 * sth2;
                txtPheptoan.setText(" * ");
                break;
            case 3 : ketqua = sth1 / sth2;
                txtPheptoan.setText(" / ");
                break;
        }
        txtSothu1.setText(sth1 + "");
        txtSothu2.setText(sth2 + "");
        txtKetqua.setText(" = " + ketqua);
    }

    private void anhxa() {
        txtKetqua = findViewById(R.id.textviewKetqua);
        txtSothu1 = findViewById(R.id.textviewNumber1);
        txtSothu2 = findViewById(R.id.textviewNumber2);
        txtPheptoan = findViewById(R.id.textviewPhepTinh);
        imgDung = findViewById(R.id.imagebuttontrue);
        imgSai = findViewById(R.id.imagebuttonfalse);
    }
}
