/*
 * Created by Andrii Kovalchuk
 * Copyright (C) 2020. roove
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see https://www.gnu.org/licenses
 */

package com.mmdev.roove.ui.common

import com.mmdev.roove.R
import com.mmdev.roove.ui.common.base.BaseRecyclerAdapter


class ImagePagerAdapter (private var imagesUrlList: List<String> = emptyList(),
						 private val layoutId: Int = R.layout.universal_pager_image_container):
		BaseRecyclerAdapter<String>(),
		BaseRecyclerAdapter.BindableAdapter<List<String>> {

	override fun getItem(position: Int) = imagesUrlList[position]
	override fun getItemCount() = imagesUrlList.size
	override fun getLayoutIdForItem(position: Int) = layoutId

	override fun setData(data: List<String>) {
		imagesUrlList = data
		notifyDataSetChanged()
	}
}