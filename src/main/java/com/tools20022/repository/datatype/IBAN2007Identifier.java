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
import com.tools20022.repository.datatype.IBAN2007Identifier.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * An identifier used internationally by financial institutions to uniquely
 * identify the account of a customer at a financial institution, as described
 * in the latest edition of the international standard ISO 13616:2007 -
 * "Banking and related financial services - International Bank Account Number (IBAN)"
 * .
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMIdentifierSet#getIdentificationScheme
 * identificationScheme} =
 * "National Banking Association; International Bank Account Number (ISO 13616)"
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMString#getPattern pattern} =
 * "[A-Z]{2,2}[0-9]{2,2}[a-zA-Z0-9]{1,30}"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AT611904300234573201"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IBAN2007Identifier"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "An identifier used internationally by financial institutions to uniquely identify the account of a customer at a financial institution, as described in the latest edition of the international standard ISO 13616:2007 - \"Banking and related financial services - International Bank Account Number (IBAN)\"."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class IBAN2007Identifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();
	protected String value;

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("AT611904300234573201");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IBAN2007Identifier";
				definition = "An identifier used internationally by financial institutions to uniquely identify the account of a customer at a financial institution, as described in the latest edition of the international standard ISO 13616:2007 - \"Banking and related financial services - International Bank Account Number (IBAN)\".";
				identificationScheme = "National Banking Association; International Bank Account Number (ISO 13616)";
				pattern = "[A-Z]{2,2}[0-9]{2,2}[a-zA-Z0-9]{1,30}";
			}
		});
		return mmObject_lazy.get();
	}

	public IBAN2007Identifier(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, IBAN2007Identifier> {
		@Override
		public IBAN2007Identifier unmarshal(String value) {
			return new IBAN2007Identifier(value);
		}

		@Override
		public String marshal(IBAN2007Identifier typedData) {
			return typedData.value;
		}
	}
}