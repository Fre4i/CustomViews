package com.frein.customviews

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.frein.customviews.databinding.ButtonsBinding

class BottomButtonsView(
    context: Context,
    attrs: AttributeSet?,
    defStyleAttr: Int,
    defStyleRes: Int
) : ConstraintLayout(context, attrs, defStyleAttr, defStyleRes) {

    private val binding: ButtonsBinding

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : this(
        context,
        attrs,
        defStyleAttr,
        0
    )

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context) : this(context, null)

    init {
        val inflater = LayoutInflater.from(context)
        inflater.inflate(R.layout.buttons, this, true)
        binding = ButtonsBinding.bind(this)

    }

    private fun initializeAttributes(attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) {
        if (attrs == null) return
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.BottomButtonsView, defStyleAttr, defStyleRes)

        with(binding) {
            val positiveButtonText = typedArray.getString(R.styleable.BottomButtonsView_bottomPositiveButtonText)
            positiveButton.text = positiveButtonText ?: "Ok"

            val negativeButtonText = typedArray.getString(R.styleable.BottomButtonsView_bottomNegativeButtonText)
            negativeButton.text = negativeButtonText ?: "Cancel"
            
        }

        typedArray.recycle()
    }

}