package leonardo.soares.mvvmwithkotlin.view


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_list.*
import leonardo.soares.mvvmwithkotlin.R


class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonList.setOnClickListener {
            val action = ListFragmentDirections.actionDetailFragment()
            //passando valor via arguments
            action.dogUuid = 5
            Navigation.findNavController(it).navigate(action)

        }
    }
}
