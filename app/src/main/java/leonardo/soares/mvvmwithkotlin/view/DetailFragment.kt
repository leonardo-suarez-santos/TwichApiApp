package leonardo.soares.mvvmwithkotlin.view


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_detail.*
import leonardo.soares.mvvmwithkotlin.R


class DetailFragment : Fragment() {
    private var dogUuid = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //recebendo  parametros via arguments
        arguments?.let {
            dogUuid = DetailFragmentArgs.fromBundle(it).dogUuid

            //setando valor recebia via argumets
            textView2.text = dogUuid.toString()

        }
        buttonDetail.setOnClickListener {
            val action = DetailFragmentDirections.actionListFragment()
            Navigation.findNavController(it).navigate(action)


        }
    }

}
