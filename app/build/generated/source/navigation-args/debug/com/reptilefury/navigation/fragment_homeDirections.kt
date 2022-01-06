package com.reptilefury.navigation

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class fragment_homeDirections private constructor() {
  public companion object {
    public fun actionFragmentHomeToLoginFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_fragment_home_to_loginFragment)
  }
}
