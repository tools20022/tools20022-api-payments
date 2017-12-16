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
import com.tools20022.repository.datatype.CUSIPIdentifier.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Committee on Uniform Securities and Identification Procedures (CUSIP). The
 * standards body that created and maintains the securities classification
 * system in the US. Non-US securities have a similar number called the CINS
 * number.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMIdentifierSet#getIdentificationScheme
 * identificationScheme} =
 * "Standards and Poor's CUSIP Service Bureau; CUSIPIdentifier"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"3134A33L8"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CUSIPIdentifier"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Committee on Uniform Securities and Identification Procedures (CUSIP). The standards body that created and maintains the securities classification system in the US. Non-US securities have a similar number called the CINS number."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CUSIPIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();
	protected String value;

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("3134A33L8");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CUSIPIdentifier";
				definition = "Committee on Uniform Securities and Identification Procedures (CUSIP). The standards body that created and maintains the securities classification system in the US. Non-US securities have a similar number called the CINS number.";
				identificationScheme = "Standards and Poor's CUSIP Service Bureau; CUSIPIdentifier";
			}
		});
		return mmObject_lazy.get();
	}

	public CUSIPIdentifier(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CUSIPIdentifier> {
		@Override
		public CUSIPIdentifier unmarshal(String value) {
			return new CUSIPIdentifier(value);
		}

		@Override
		public String marshal(CUSIPIdentifier typedData) {
			return typedData.value;
		}
	}
}