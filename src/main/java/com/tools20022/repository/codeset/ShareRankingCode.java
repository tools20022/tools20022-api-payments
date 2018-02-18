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
import com.tools20022.repository.codeset.ShareRankingCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the shares are ranking for dividend or pari passu.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ShareRankingCode#Dividend
 * ShareRankingCode.Dividend}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ShareRankingCode#PariPassu
 * ShareRankingCode.PariPassu}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DIVI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ShareRankingCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the shares are ranking for dividend or pari passu."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ShareRankingCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Payable on the date specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ShareRankingCode
	 * ShareRankingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIVI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payable on the date specified."</li>
	 * </ul>
	 */
	public static final ShareRankingCode Dividend = new ShareRankingCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Dividend";
			definition = "Payable on the date specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.ShareRankingCode.mmObject();
			codeName = "DIVI";
		}
	};
	/**
	 * Pari Passu. With equal rights as other shares of the company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ShareRankingCode
	 * ShareRankingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PARI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PariPassu"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Pari Passu. With equal rights as other shares of the company."</li>
	 * </ul>
	 */
	public static final ShareRankingCode PariPassu = new ShareRankingCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PariPassu";
			definition = "Pari Passu. With equal rights as other shares of the company.";
			owner_lazy = () -> com.tools20022.repository.codeset.ShareRankingCode.mmObject();
			codeName = "PARI";
		}
	};
	final static private LinkedHashMap<String, ShareRankingCode> codesByName = new LinkedHashMap<>();

	protected ShareRankingCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DIVI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ShareRankingCode";
				definition = "Specifies whether the shares are ranking for dividend or pari passu.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ShareRankingCode.Dividend, com.tools20022.repository.codeset.ShareRankingCode.PariPassu);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Dividend.getCodeName().get(), Dividend);
		codesByName.put(PariPassu.getCodeName().get(), PariPassu);
	}

	public static ShareRankingCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ShareRankingCode[] values() {
		ShareRankingCode[] values = new ShareRankingCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ShareRankingCode> {
		@Override
		public ShareRankingCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ShareRankingCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}