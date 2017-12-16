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

import com.tools20022.metamodel.MMIdentifierSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.RussianCentralBankIdentificationCodeIdentifier.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Russian Central Bank Identification Code. Identifies Russian financial
 * institutions on the Russian national clearing system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMIdentifierSet#getIdentificationScheme
 * identificationScheme} =
 * "Central Bank of Russia; RussianCentralBankIdentificationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMString#getPattern pattern} =
 * "RU[0-9]{9,9}"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"RU123456789"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RussianCentralBankIdentificationCodeIdentifier"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Russian Central Bank Identification Code. Identifies Russian financial institutions on the Russian national clearing system."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RussianCentralBankIdentificationCodeIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();
	protected String value;

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("RU123456789");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RussianCentralBankIdentificationCodeIdentifier";
				definition = "Russian Central Bank Identification Code. Identifies Russian financial institutions on the Russian national clearing system.";
				identificationScheme = "Central Bank of Russia; RussianCentralBankIdentificationCode";
				pattern = "RU[0-9]{9,9}";
			}
		});
		return mmObject_lazy.get();
	}

	public RussianCentralBankIdentificationCodeIdentifier(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RussianCentralBankIdentificationCodeIdentifier> {
		@Override
		public RussianCentralBankIdentificationCodeIdentifier unmarshal(String value) {
			return new RussianCentralBankIdentificationCodeIdentifier(value);
		}

		@Override
		public String marshal(RussianCentralBankIdentificationCodeIdentifier typedData) {
			return typedData.value;
		}
	}
}