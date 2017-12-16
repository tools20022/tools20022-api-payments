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

import com.tools20022.metamodel.MMRate;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.PercentageRate.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Rate expressed as a percentage, ie, in hundredths, eg, 0.7 is 7/10 of a
 * percent, and 7.0 is 7%.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"35"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PercentageRate"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Rate expressed as a percentage, ie, in hundredths, eg, 0.7 is 7/10 of a percent, and 7.0 is 7%."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PercentageRate {

	final static private AtomicReference<MMRate> mmObject_lazy = new AtomicReference<>();
	protected BigDecimal value;

	final static public MMRate mmObject() {
		mmObject_lazy.compareAndSet(null, new MMRate() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("35");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PercentageRate";
				definition = "Rate expressed as a percentage, ie, in hundredths, eg, 0.7 is 7/10 of a percent, and 7.0 is 7%.";
				baseValue = 100.0;
				totalDigits = 11;
				fractionDigits = 10;
			}
		});
		return mmObject_lazy.get();
	}

	public PercentageRate(BigDecimal value) {
		this.value = value;
	}

	public BigDecimal toBigDecimal() {
		return value;
	}

	protected static class InternalXmlAdapter extends XmlAdapter<BigDecimal, PercentageRate> {
		@Override
		public PercentageRate unmarshal(BigDecimal value) {
			return new PercentageRate(value);
		}

		@Override
		public BigDecimal marshal(PercentageRate typedData) {
			return typedData.value;
		}
	}
}