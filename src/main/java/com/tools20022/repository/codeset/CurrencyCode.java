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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CurrencyCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Code allocated to a currency, by a maintenance agency, under an international
 * identification scheme as described in the latest edition of the international
 * standard ISO 4217 "Codes for the representation of currencies and funds".
 * Valid currency codes are registered with the ISO 4217 Maintenance Agency, and
 * consist of three contiguous letters.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMString#getPattern pattern} =
 * "[A-Z]{3,3}"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AWG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CurrencyCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Code allocated to a currency, by a maintenance agency, under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\". Valid currency codes are registered with the ISO 4217 Maintenance Agency, and consist of three contiguous letters."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CurrencyCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	final static private LinkedHashMap<String, CurrencyCode> codesByName = new LinkedHashMap<>();

	protected CurrencyCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("AWG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrencyCode";
				definition = "Code allocated to a currency, by a maintenance agency, under an international identification scheme as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\". Valid currency codes are registered with the ISO 4217 Maintenance Agency, and consist of three contiguous letters.";
				pattern = "[A-Z]{3,3}";
			}
		});
		return mmObject_lazy.get();
	}

	static {
	}

	public static CurrencyCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CurrencyCode[] values() {
		CurrencyCode[] values = new CurrencyCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CurrencyCode> {
		@Override
		public CurrencyCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CurrencyCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}