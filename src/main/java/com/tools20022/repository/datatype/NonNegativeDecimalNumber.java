/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
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
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMQuantity;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.NonNegativeDecimalNumber.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Number of objects represented as a non negative decimal number, eg, 0.75 or
 * 45.6.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMDecimal#getMinInclusive
 * minInclusive} = "0"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"0"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NonNegativeDecimalNumber"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Number of objects represented as a non negative decimal number, eg, 0.75 or 45.6."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NonNegativeDecimalNumber {

	final static private AtomicReference<MMQuantity> mmObject_lazy = new AtomicReference<>();
	protected BigDecimal value;

	final static public MMQuantity mmObject() {
		mmObject_lazy.compareAndSet(null, new MMQuantity() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("0");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NonNegativeDecimalNumber";
				definition = "Number of objects represented as a non negative decimal number, eg, 0.75 or 45.6.";
				minInclusive = "0";
				totalDigits = 18;
				fractionDigits = 17;
			}
		});
		return mmObject_lazy.get();
	}

	public NonNegativeDecimalNumber(BigDecimal value) {
		this.value = value;
	}

	public BigDecimal toBigDecimal() {
		return value;
	}

	protected static class InternalXmlAdapter extends XmlAdapter<BigDecimal, NonNegativeDecimalNumber> {
		@Override
		public NonNegativeDecimalNumber unmarshal(BigDecimal value) {
			return new NonNegativeDecimalNumber(value);
		}

		@Override
		public BigDecimal marshal(NonNegativeDecimalNumber typedData) {
			return typedData.value;
		}
	}
}