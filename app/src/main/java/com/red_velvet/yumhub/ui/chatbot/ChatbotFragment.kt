package com.red_velvet.yumhub.ui.chatbot

import androidx.annotation.LayoutRes
import androidx.fragment.app.viewModels
import com.red_velvet.yumhub.R
import com.red_velvet.yumhub.databinding.FragmentChatbotBinding
import com.red_velvet.yumhub.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ChatbotFragment : BaseFragment<FragmentChatbotBinding,
        ChatBotUIState, ChatBotUIEffect, ChatBotViewModel>() {
    @LayoutRes
    override val layoutIdFragment: Int = R.layout.fragment_chatbot
    override val viewModel: ChatBotViewModel by viewModels()

    override fun observeOnUIEffects() {

    }

    override fun handleUIEffect(uiEffect: ChatBotUIEffect) {

    }
}