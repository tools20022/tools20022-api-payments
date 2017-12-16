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

import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.metamodel.MMText;
import com.tools20022.repository.datatype.Max15PlusSignedNumericText.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies a numeric string with a maximum length of 15 digits and may be
 * prefixed with a plus sign.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMString#getPattern pattern} =
 * "[\\+]{0,1}[0-9]{1,15}"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Max15PlusSignedNumericText"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies a numeric string with a maximum length of 15 digits and may be prefixed with a plus sign."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Max15PlusSignedNumericText {

	final static private AtomicReference<MMText> mmObject_lazy = new AtomicReference<>();
	protected String value;

	final static public MMText mmObject() {
		mmObject_lazy.compareAndSet(null, new MMText() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Max15PlusSignedNumericText";
				definition = "Specifies a numeric string with a maximum length of 15 digits and may be prefixed with a plus sign.";
				pattern = "[\\+]{0,1}[0-9]{1,15}";
			}
		});
		return mmObject_lazy.get();
	}

	public Max15PlusSignedNumericText(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Max15PlusSignedNumericText> {
		@Override
		public Max15PlusSignedNumericText unmarshal(String value) {
			return new Max15PlusSignedNumericText(value);
		}

		@Override
		public String marshal(Max15PlusSignedNumericText typedData) {
			return typedData.value;
		}
	}
}