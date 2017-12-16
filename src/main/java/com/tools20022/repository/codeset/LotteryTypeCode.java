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
import com.tools20022.repository.codeset.LotteryTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of lottery.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LotteryTypeCode#OriginalLotteryNotification
 * LotteryTypeCode.mmOriginalLotteryNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LotteryTypeCode#SupplementalLotteryNotification
 * LotteryTypeCode.mmSupplementalLotteryNotification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ORIG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LotteryTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of lottery."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class LotteryTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Original lottery that has been announced for a specific amount and date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LotteryTypeCode
	 * LotteryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORIG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalLotteryNotification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original lottery that has been announced for a specific amount and date."
	 * </li>
	 * </ul>
	 */
	public static final LotteryTypeCode OriginalLotteryNotification = new LotteryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OriginalLotteryNotification";
			definition = "Original lottery that has been announced for a specific amount and date.";
			owner_lazy = () -> com.tools20022.repository.codeset.LotteryTypeCode.mmObject();
			codeName = "ORIG";
		}
	};
	/**
	 * Supplemental or additional quantity called on a previously announced
	 * original lottery.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LotteryTypeCode
	 * LotteryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUPP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementalLotteryNotification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Supplemental or additional quantity called on a previously announced original lottery."
	 * </li>
	 * </ul>
	 */
	public static final LotteryTypeCode SupplementalLotteryNotification = new LotteryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SupplementalLotteryNotification";
			definition = "Supplemental or additional quantity called on a previously announced original lottery.";
			owner_lazy = () -> com.tools20022.repository.codeset.LotteryTypeCode.mmObject();
			codeName = "SUPP";
		}
	};
	final static private LinkedHashMap<String, LotteryTypeCode> codesByName = new LinkedHashMap<>();

	protected LotteryTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ORIG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LotteryTypeCode";
				definition = "Specifies the type of lottery.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LotteryTypeCode.OriginalLotteryNotification, com.tools20022.repository.codeset.LotteryTypeCode.SupplementalLotteryNotification);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OriginalLotteryNotification.getCodeName().get(), OriginalLotteryNotification);
		codesByName.put(SupplementalLotteryNotification.getCodeName().get(), SupplementalLotteryNotification);
	}

	public static LotteryTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static LotteryTypeCode[] values() {
		LotteryTypeCode[] values = new LotteryTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, LotteryTypeCode> {
		@Override
		public LotteryTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(LotteryTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}